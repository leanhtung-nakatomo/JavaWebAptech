@RequestMapping("/SPCT")
    public String listSPCT(Integer offset, Integer maxResult, Model model){
        List<SanPhamChiTiet> allSPCT = new DAO().getAllSPCT(offset, maxResult);
        model.addAttribute("SPCT", allSPCT);
        long total = new DAO().getTotalSPCTRecord();
        model.addAttribute("total", total);
        model.addAttribute("offset", offset);
        return "SPCTlist";
    }
    @RequestMapping("/SPCTlist")
    public String listSPCT(Model model,Integer offset, Integer maxResult){
        List<SanPhamChiTiet> allSPCT = new DAO().getSPCT(offset,maxResult);
        model.addAttribute("SPCT", allSPCT);
        return "SPCTlist";
    }
    @RequestMapping("/Nsx")
    public String listNsx(Integer offset, Integer maxResult, Model model){
        List<Nsx> allNsx = new DAO().getAllNsx(offset, maxResult);
        model.addAttribute("Nsx", allNsx);
        long total = new DAO().getTotalSPCTRecord();
        model.addAttribute("total", total);
        model.addAttribute("offset", offset);
        return "Nsxlist";
    }
   
    @RequestMapping("/DanhMuc")
    public String listDM(Integer offset, Integer maxResult, Model model){
        List<DanhMuc> allDM = new DAO().getAllDM(offset, maxResult);
        model.addAttribute("DM", allDM);
        long total = new DAO().getTotalSPCTRecord();
        model.addAttribute("total", total);
        model.addAttribute("offset", offset);
        return "DMlist";
    }
    
    @RequestMapping("/SanPham")
    public String listSP(Integer offset, Integer maxResult, Model model){
        List<SanPham> allSP = new DAO().getAllSP(offset, maxResult);
        model.addAttribute("SP", allSP);
        long total = new DAO().getTotalSPCTRecord();
        model.addAttribute("total", total);
        model.addAttribute("offset", offset);
        return "SPlist";
    }
    
    @RequestMapping("/Size")
    public String listSize(Integer offset, Integer maxResult, Model model){
        List<KichThuoc> allSize = new DAO().getAllSize(offset, maxResult);
        model.addAttribute("Size2", allSize);
        long total = new DAO().getTotalSizeRecord();
        model.addAttribute("total", total);
        model.addAttribute("offset", offset);
        return "Sizelist";
    }
    
    @RequestMapping("/Color")
    public String listColor(Integer offset, Integer maxResult, Model model){
        List<MauSac> allColor = new DAO().getAllColor(offset, maxResult);
        model.addAttribute("color", allColor);
        long total = new DAO().getTotalColorRecord();
        model.addAttribute("total", total);
        model.addAttribute("offset", offset);
        return "Colorlist";
    }