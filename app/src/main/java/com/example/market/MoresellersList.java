package com.example.market;

public class MoresellersList {
    private String moreSellname;
    private String moreSelllocation;
    private String moreSellerDesc;
    private String moreSellerImg;
//jdida
    public MoresellersList() {
    }

    public MoresellersList(String moreSellname, String moreSelllocation, String moreSellerDesc, String moreSellerImg) {
        this.moreSellname = moreSellname;
        this.moreSelllocation = moreSelllocation;
        this.moreSellerDesc = moreSellerDesc;
        this.moreSellerImg = moreSellerImg;
    }

    public String getMoreSellname() {
        return moreSellname;
    }

    public void setMoreSellname(String moreSellname) {
        this.moreSellname = moreSellname;
    }

    public String getMoreSelllocation() {
        return moreSelllocation;
    }

    public void setMoreSelllocation(String moreSelllocation) {
        this.moreSelllocation = moreSelllocation;
    }

    public String getMoreSellerDesc() {
        return moreSellerDesc;
    }

    public void setMoreSellerDesc(String moreSellerDesc) {
        this.moreSellerDesc = moreSellerDesc;
    }

    public String getMoreSellerImg() {
        return moreSellerImg;
    }

    public void setMoreSellerImg(String moreSellerImg) {
        this.moreSellerImg = moreSellerImg;
    }
}
