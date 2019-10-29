package PointV2;

public class testMoveablePointV2 {
    public static void main(String[] args) {
        MoveablePointV2 moveablePointV2 = new MoveablePointV2();
        System.out.print("Before move: ");
        moveablePointV2 = new MoveablePointV2(4, 5, 6, 7);
        System.out.println(moveablePointV2);
        moveablePointV2 = moveablePointV2.move();
        System.out.print("After move: ");
        System.out.println(moveablePointV2);

    }
}
