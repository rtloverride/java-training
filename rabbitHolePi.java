package newbieContest;

public class Main {
    public static void main(String[] args) {
        int i, j, k, l, m, n, o, p, q, r, s, count;
        int[] nb2 = new int[10];
        int[] nb = new int[10];

        for (i = 1; i < 10; i++) {
        for (j = 2; j < 10; j++) {
        for (k = 3; k < 10; k++) {
        for (l = 4; l < 10; l++) {
        for (m = 5; m < 10; m++) {
        for (n = 6; n < 10; n++) {
        for (o = 7; o < 10; o++) {
        for (p = 5; p < 10; p++) {
        for (q = 7; q < 10; q++) {
        for (r = 2; r < 10; r++) {

            nb2[0] = i;
            nb2[1] = j;
            nb2[2] = k;
            nb2[3] = l;
            nb2[4] = m;
            nb2[5] = n;
            nb2[6] = o;
            nb2[7] = p;
            nb2[8] = q;
            nb2[9] = r;

            nb[0] = 1;
            nb[1] = 2;
            nb[2] = 3;
            nb[3] = 4;
            nb[4] = 5;
            nb[5] = 6;
            nb[6] = 7;
            nb[7] = 5;
            nb[8] = 7;
            nb[9] = 2;

            nb[nb2[0]] += 1;
            nb[nb2[1]] += 1;
            nb[nb2[2]] += 1;
            nb[nb2[3]] += 1;
            nb[nb2[4]] += 1;
            nb[nb2[5]] += 1;
            nb[nb2[6]] += 1;
            nb[nb2[7]] += 1;
            nb[nb2[8]] += 1;
            nb[nb2[9]] += 1;

            count = 0;
            for (s = 0; s < 10; s++) {
                if (nb[s] == nb2[s]) count++;
            }

            if (count == 10) {
                for (s = 0; s < 10; s++)
                    System.out.print(nb2[s]);
                System.exit(0);
            }

        }}}}}}}}}}
    }
}
