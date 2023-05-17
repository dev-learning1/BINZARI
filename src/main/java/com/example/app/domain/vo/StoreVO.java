package com.example.app.domain.vo;

public class StoreVO {
    // 가게 번호
    private Long storeNumber;
    // 가게 이름
    private String storeName;
    // 가게 주소
    private String storeAddress;
    // 가게 전화번호
    private String storePhone;
    // 가게 상태
    private String storeCategory;
    // 최초 등록일
    private String storeRegisterDate;
    // 수정 등록일
    private String storeUpdateDate;
    // 유저 번호
    private Long userNumber;


    public Long getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(Long storeNumber) {
        this.storeNumber = storeNumber;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public String getStoreCategory() {
        return storeCategory;
    }

    public void setStoreCategory(String storeCategory) {
        this.storeCategory = storeCategory;
    }

    public String getStoreRegisterDate() {
        return storeRegisterDate;
    }

    public void setStoreRegisterDate(String storeRegisterDate) {
        this.storeRegisterDate = storeRegisterDate;
    }

    public String getStoreUpdateDate() {
        return storeUpdateDate;
    }

    public void setStoreUpdateDate(String storeUpdateDate) {
        this.storeUpdateDate = storeUpdateDate;
    }

    @Override
    public String toString() {
        return "StoreVO{" +
                "storeNumber=" + storeNumber +
                ", storeName='" + storeName + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", storePhone='" + storePhone + '\'' +
                ", storeCategory='" + storeCategory + '\'' +
                ", storeRegisterDate='" + storeRegisterDate + '\'' +
                ", storeUpdateDate='" + storeUpdateDate + '\'' +
                ", userNumber=" + userNumber +
                '}';
    }
}
