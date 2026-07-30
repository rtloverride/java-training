package newbieContest;

public class laserOsmotique {
    public static void main(String[] args) {
        int comptSol = 0;
        for (int R_0 = 1; R_0 < 273; R_0++) {
            for (int R_1 = 1; R_1 < 273; R_1++) {
                double x_p = ((Math.pow(R_0, 2)) - (Math.pow(R_1, 2)) - (Math.pow(273, 2))) / (2.0 * (-273.0));
                double y_pcarre = Math.pow(R_0, 2) - Math.pow((Math.pow(273, 2) - Math.pow(R_1, 2) + Math.pow(R_0, 2)) / 546.0, 2);
                
                if (y_pcarre > 0) {
                    double y_p = Math.sqrt(y_pcarre);
                    double dist = Math.sqrt(Math.pow(x_p - (273.0 / 2.0), 2) + Math.pow(y_p - (273.0 * Math.sqrt(3.0)) / 2.0, 2));
                    long roundedDist = Math.round(dist);
                    double diff = dist - roundedDist;
                    
                    if (-0.0000001 < diff && diff < 0.0000001) {
                        comptSol++;
                        System.out.println(comptSol + " : R_0 = " + R_0 + "; R_1 = " + R_1 + " ; R_2 = " + roundedDist + " -- erreur = " + diff);
                    }
                }
            }
        }
    }
}
