<form id="form" action="xulydieuhuong.htm">
                <input type="hidden" id="mamausac" name="mausac" value=""/>
                <input type="hidden" id="makichthuoc" name="makichthuoc" value=""/>
                <input type="hidden" id="maspct1" name="maspct1" value=""/>
            </form>
            
            <script>
                function xulymausac(maMS){
                    var maspct = document.getElementById("maspct").innerHTML;
                    document.getElementById("mamausac").value = maMS;
//                    alert(maMS+" "+document.getElementById("makichthuoc").value);
                    if(document.getElementById("mamausac").value.length >0 && document.getElementById("makichthuoc").value.length >0) 
                        document.getElementById("form").submit();
                }
            </script>
            
            <script>
                function xulykichthuong(maKT){
                    var maspct = document.getElementById("maspct").innerHTML;
                    document.getElementById("makichthuoc").value = maKT;
                    document.getElementById("maspct1").value = maspct;
                    if(document.getElementById("mamausac").value.length >0 && document.getElementById("makichthuoc").value.length >0) 
                        document.getElementById("form").submit();
//                    alert(maKT+" "+maspct);
                }
            </script>
            <script>
                function changeimage(stt) {
                    var s1 = document.getElementById(stt).innerHTML;
//                    alert(s1);
                    document.getElementById("imagecenter").src = "/DuAnJAVAWeb/jspadmin/resources/images/" + s1;
                }

            </script>