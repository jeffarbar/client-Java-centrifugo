package com.tivit.centrifugo.credentials;



/**
 * Created by semyon on 05.05.16.
 */
public class Token {

   
    private String token;

   
    private String tokenTimestamp;

    public Token( final String token, final String tokenTimestamp) {
        this.token = token;
        this.tokenTimestamp = tokenTimestamp;
    }

   
    public String getToken() {
        return token;
    }

   
    public String getTokenTimestamp() {
        return tokenTimestamp;
    }

    @Override
    public String toString() {
        return "Token{" +
                "token='" + token + '\'' +
                ", tokenTimestamp='" + tokenTimestamp + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Token token1 = (Token) o;

        if (!token.equals(token1.token)) return false;
        return tokenTimestamp.equals(token1.tokenTimestamp);

    }

    @Override
    public int hashCode() {
        int result = token.hashCode();
        result = 31 * result + tokenTimestamp.hashCode();
        return result;
    }

}