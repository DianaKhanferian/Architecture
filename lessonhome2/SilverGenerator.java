package lessonhome2;

public class SilverGenerator extends ItemFabric  {

    @Override
    public iGameItem createItem() {
        System.out.println("Создала новый сундук");
        return new SilverReward();
    }

}