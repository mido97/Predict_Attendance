package models;

import com.google.common.base.MoreObjects;
import java.util.Objects;

public final class FlInsuranceData {

    private final String Date;
    private final String Requete;
    private final String User;
    private final String Message;

    private FlInsuranceData(final Builder builder) {
        this.Date = builder.Date;
        this.Requete = builder.Requete;
        this.User = builder.User;
        this.Message = builder.Message;
    }

    public String getDate() { return this.Date; }
    public String getRequete() { return this.Requete; }
    public String getUser() { return this.User; }
    public String getMessage() { return this.Message; }

    @Override
    public int hashCode() {
        return Objects.hash(Date, Requete, User, Message);
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FlInsuranceData other = (FlInsuranceData) obj;
        return Objects.equals(this.Date, other.Date)
                && Objects.equals(this.Requete, other.Requete)
                && Objects.equals(this.User, other.User)
                && Objects.equals(this.Message, other.Message);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("Date", Date)
                .add("Requete", Requete)
                .add("User", User)
                .add("Message", Message)
                .toString();
    }

    public static class Builder{
        private String Date;
        private String Requete;
        private String User;
        private String Message;

        public Builder Date(final String Date) {
            this.Date = Date;
            return this;
        }

        public Builder Requete(final String Requete) {
            this.Requete = Requete;
            return this;
        }

        public Builder User(final String User) {
            this.User = User;
            return this;
        }

        public Builder Message(final String Message) {
            this.Message = Message;
            return this;
        }

        public FlInsuranceData build() {
            return new FlInsuranceData(this);
        }
    }

}