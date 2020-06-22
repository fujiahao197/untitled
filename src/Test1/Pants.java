package Test1;

public class Pants {
    /**
     * 裤子编码
     */
    private int PantsId;
    /**
     * 类型
     */
    private String PantsKind;
    /**
     * 颜色
     */
    private String PantsColor;
    /**
     * 尺码
     */
    private String PantsSize;


    @Override
    public String toString() {
        return "Pants{" +
                "PantsId=" + PantsId +
                ", PantsKind='" + PantsKind + '\'' +
                ", PantsColor='" + PantsColor + '\'' +
                ", PantsSize='" + PantsSize + '\'' +
                '}';
    }

    public int getPantsId() {
        return PantsId;
    }

    public void setPantsId(int pantsId) {
        PantsId = pantsId;
    }

    public String getPantsKind() {
        return PantsKind;
    }

    public void setPantsKind(String pantsKind) {
        PantsKind = pantsKind;
    }

    public String getPantsColor() {
        return PantsColor;
    }

    public void setPantsColor(String pantsColor) {
        PantsColor = pantsColor;
    }

    public String getPantsSize() {
        return PantsSize;
    }

    public void setPantsSize(String pantsSize) {
        PantsSize = pantsSize;
    }
}
