/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handertag;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author PT-LS
 */
public class Paganition extends SimpleTagSupport {
    private int offset;
    private int maxResult;
    private String uri;
    private long totalRecord;
    private String next;
    private String previous;

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            // TODO: insert code to write html before writing the body content.
            // e.g.:
            //
            // out.println("<strong>" + attribute_1 + "</strong>");
            // out.println("    <blockquote>");

            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }
            out.write("<nav>");
            out.write("<ul class=\"pagination\">");
            if (offset < maxResult) {
                out.write(constructLink(1, previous, "disabled", true));
            } else {
                out.write(constructLink(offset - maxResult, previous, null, false));
            }

            for (int index = 0; index < totalRecord; index += maxResult) {
                if (index == offset) {
                    //hiện tại trang đó đang được click vào (ví dụ: trang 5, trang 10)
                    out.write(constructLink(index, String.valueOf(index / maxResult + 1), "active", true));
                } else {
                    out.write(constructLink(index, String.valueOf(index / maxResult + 1), null, false));
                }
            }

            if (offset + maxResult >= totalRecord) {
                //button next không cho click nữa
                out.write(constructLink(offset + maxResult, next, "disabled", true));
            } else {
                out.write(constructLink(offset + maxResult, next, null, false));
            }

            out.write("</ul>");
            out.write("</nav>");
            // TODO: insert code to write html after writing the body content.
            // e.g.:
            //
            // out.println("    </blockquote>");
        } catch (java.io.IOException ex) {
            throw new JspException("Error in Paganition tag", ex);
        }
    }
    private String constructLink(int page, String text, String className, boolean disable) {
        StringBuilder str = new StringBuilder("<li");
        if (className != null) {
            str.append(" class=\"").append(className).append("\"");
        }
        if (disable) {
            str.append("><a href=\"#\">").append(text).append("</a></li>");
        } else {
            str.append("><a href=\"").append(uri).append("?offset=").append(page).append("\">").append(text).append("</a></li>");
        }
        return str.toString();
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public void setMaxResult(int maxResult) {
        this.maxResult = maxResult;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    
    
}
