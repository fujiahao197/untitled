package Clothes;

public class Pants {
    /**
     * 裤子商品码
     */
    private int pantsId;
    /**
     * 款式
     */
    private String kind;
    /**
     * 颜色
     */
    private String color;
    /**
     * 尺码
     */
    private String size;
    /**
     * 材料
     */
    private String materials;


    @Override
    public String toString() {
        return "Pants{" +
                "pantsId=" + pantsId +
                ", kind='" + kind + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", materials='" + materials + '\'' +
                '}';
    }

    public int getPantsId() {
        return pantsId;
    }

    public void setPantsId(int pantsId) {
        this.pantsId = pantsId;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }
}
