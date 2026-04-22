package accesoire;

public class Date {
    int j;
    int m;
    int a;

    public Date(int jj, int mm, int aa) {
        this.j = jj;
        this.m = mm;
        this.a = aa;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getA() {
        return a;
    }

    public int getJ() {
        return j;
    }

    public int getM() {
        return m;
    }

    public int compareDate(Date d) {
        if (this.a < d.a) {
            return 2;
        } else if (this.a > d.a) {
            return 1;
        } else {
            if (this.m < d.m) {
                return 2;
            } else if (this.m > d.m) {
                return 1;
            } else {
                if (this.j < d.j) {
                    return 2;
                } else if (this.j > d.j) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    boolean seTerminepar31() {
        boolean veracite = false;
        if (this.m < 8) {
            if (this.m % 2 != 0) {
                veracite = true;
            } else {
                veracite = false;
            }

        } else if (this.m > 8) {
            if (this.m % 2 != 0) {
                veracite = true;
            } else {
                veracite = false;
            }
        } else {
            veracite = true;
        }
        return veracite;
    }

    public void ajouterJour(int day) {
        this.j += day;

        while (this.j < 1) {
            if (this.m == 1) {
                this.m = 12;
                this.a--;
            } else {
                this.m--;
            }
            if (this.m == 2) {
                if (this.a % 4 == 0) {
                    this.j += 29;
                } else {
                    this.j += 28;
                }
            } else if (this.m == 4 || this.m == 6 || this.m == 9 || this.m == 11) {
                this.j += 30;
            } else {
                this.j += 31;
            }
        }

        while (true) {
            int lim;
            if (this.m == 2) {
                if (this.a % 4 == 0) {
                    lim = 29;
                } else {
                    lim = 28;
                }
            } else if (this.m == 4 || this.m == 6 || this.m == 9 || this.m == 11) {
                lim = 30;
            } else {
                lim = 31;
            }

            if (this.j > lim) {
                this.j -= lim;
                if (this.m == 12) {
                    this.m = 1;
                    this.a++;
                } else {
                    this.m++;
                }
            } else {
                break;
            }
        }
    }

    public int Age() {
        Date androany = new Date(27, 8, 2026);
        int taona = androany.a - this.a;
        Date birthdayThisYear = new Date(this.j, this.m, androany.a);
        if (birthdayThisYear.compareDate(androany) == 1) {
            taona--;
        }
        return taona;
    }
}
