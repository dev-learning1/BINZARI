package com.example.app.domain.vo;

public class StoreFileVO {
    //번호
    private Long storeFileNumber;
    // 이름
    private String storeFileName;
    // 업로드 경로
    private String storeFileUploadPath;
    // uuid
    private String storeFileUuid;
    // 확장자 체크
    private String storeFileImageCheck;
    // 크기
    private int storeFileSize;
    // 가게 번호(fk)
    private Long storeNumber;
}
