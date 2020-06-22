package Test1;

public class Tops {
    /**
     * 上衣编码
     */
    private int TopsId;
    /**
     * 类型
     */
    private String TopsKind;
    /**
     * 颜色
     */
    private String TopsColor;
    /**
     * 尺码
     */
    private String TopsSize;

    @Override
    public String toString() {
        return "Tops{" +
                "TopsId=" + TopsId +
                ", TopsKind='" + TopsKind + '\'' +
                ", TopsColor='" + TopsColor + '\'' +
                ", TopsSize='" + TopsSize + '\'' +
                '}';
    }

    public int getTopsId() {
        return TopsId;
    }

    public void setTopsId(int topsId) {
        TopsId = topsId;
    }

    public String getTopsKind() {
        return TopsKind;
    }

    public void setTopsKind(String topsKind) {
        TopsKind = topsKind;
    }

    public String getTopsColor() {
        return TopsColor;
    }

    public void setTopsColor(String topsColor) {
        TopsColor = topsColor;
    }

    public String getTopsSize() {
        return TopsSize;
    }

    public void setTopsSize(String topsSize) {
        TopsSize = topsSize;
    }
}
