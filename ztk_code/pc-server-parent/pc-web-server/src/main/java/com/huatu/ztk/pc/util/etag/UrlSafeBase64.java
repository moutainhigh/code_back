package com.huatu.ztk.pc.util.etag;


public class UrlSafeBase64 {
    private UrlSafeBase64() {
    }   // don't instantiate

    /**
     * 编码数据
     *
     * @param data 字节数组
     * @return 结果字符串
     */
    public static String encodeToString(byte[] data) {
        return Base64.encodeToString(data, Base64.URL_SAFE | Base64.NO_WRAP);
    }
}
