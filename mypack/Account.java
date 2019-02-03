class Account{
    public static void main(String[] args) {
        Balance current[] =  new Balance[3];
        current[0] = new Balance("K. J. Fielding", 123.23);
        current[1] = new Balance("K. Moura", 90.23);
        current[2] = new Balance("Nakamura D.", 100.23);
        for (Balance aBalance: current) {
            aBalance.show();
        }
    }
}