public class Main {
    public static void main(String[] args) {

        WallMaterial brick = new BrickWalls();
        WallMaterial wooden = new WoodenWalls();

        House house = new SmartHouse(brick);
        house.build();

        System.out.println();
        System.out.println("Switching the smart house to wooden walls:");
        house.setWallMaterial(wooden);
        house.build();

        System.out.println();

        House luxuryHouse = new LuxuryHouse(brick);
        luxuryHouse.build();

        System.out.println();
        System.out.println("Switching the luxury house to wooden walls:");
        luxuryHouse.setWallMaterial(wooden);
        luxuryHouse.build();
    }
}
