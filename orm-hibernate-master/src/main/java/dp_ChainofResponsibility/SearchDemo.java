package dp_ChainofResponsibility;

public abstract class SearchDemo {

        protected SearchDemo successor;

        public void setSuccessor(SearchDemo successor) {
            this.successor = successor;
        }

        public abstract void handleRequest(String searchQuery);
    }


