package entity.user;

public class Seller extends User {

    private String card;

    public Seller() {}
    // todo singleton design pattern
    public Seller(String card) {
        this.card = card;
    }

    public Seller(Integer id, String nickname, String email, String password, String card) {
        super(id, nickname, email, password);
        this.card = card;
    }


    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}
