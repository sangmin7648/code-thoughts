public enum MyBankAccount {

    ON_PAYDAY {
        @Override
        public String getBalance() {
            return "$$$";
        }
    },
    OFF_PAYDAY {
        @Override
        public String getBalance() {
            return "0";
        }
    };

    public abstract String getBalance();

}
