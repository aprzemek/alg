package zadanie.potegowanie;

public class Power {public long powerRecursion(int a, int b) {
    if (b == 0) {
        return 1;
    } else if (b % 2 == 1) {
        return a * powerRecursion(a, b / 2) * powerRecursion(a, b / 2);
    } else {
        return powerRecursion(a, b / 2) * powerRecursion(a, b / 2);
    }
}

    public long powerIteration(int a, int b) {
        int result = 1;
        while (b > 0) {
            result *= a;
            b--;
        }
        return result;
    }

    public long powerRecursionSlow(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a* powerRecursionSlow(a, b - 1);
        }
    }

}
