public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        int northSouthPosition = 0;
        int westEastPosition = 0;

        for (char direction : walk) {
            switch (direction) {
                case 'n':
                    northSouthPosition++;
                    break;
                case 'e':
                    westEastPosition++;
                    break;
                case 's':
                    northSouthPosition--;
                    break;
                case 'w':
                    westEastPosition--;
                    break;
                default:
                    throw new IllegalStateException("Unknown direction: " + direction);
            }
        }

        return northSouthPosition == 0 && westEastPosition == 0;
    }
}
