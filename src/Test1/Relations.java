package Test1;

public class Relations {
    /**
     * 搭配类型编码
     */
    private int id;
    /**
     * 上衣编码
     */
    private int TopsId;
    /**
     * 上衣类型
     */
    private String TopsKind;
    /**
     * 裤子编码
     */
    private int PantsId;
    /**
     * 裤子类型
     */
    private String PantsKind;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
