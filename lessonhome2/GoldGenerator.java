package lessonhome2;

public class GoldGenerator extends ItemFabric {

    @Override
    public iGameItem createItem() {
        System.out.println("Создала новый сундук");
        return new GoldReward();
    }
}