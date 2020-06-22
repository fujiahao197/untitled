package Clothes;

public class Relation {
    public Object setKindsId;
    /**
     * 搭配id
     */
    private int id;
    /**
     * 上衣商品码
     */
    private int topsId;
    /**
     * 裤子商品码
     */
    private int pantsId;


    @Override
    public String toString() {
        return "Relation{" +
                "id=" + id +
                ", topsId=" + topsId +
                ", pantsId=" + pantsId +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTopsId() {
        return topsId;
    }

    public void setTopsId(int topsId) {
        this.topsId = topsId;
    }

    public int getPantsId() {
        return pantsId;
    }

    public void setPantsId(int pantsId) {
        this.pantsId = pantsId;
    }
}
