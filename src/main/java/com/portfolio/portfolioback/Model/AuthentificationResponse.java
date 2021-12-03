package com.portfolio.portfolioback.Model;


import com.portfolio.portfolioback.Configuration.UserPrincipal;

public class AuthentificationResponse {


    /** Token value. */
    private String token;

    /** Token type. */
    private String type = "Bearer";

    /** UserPrinciple class. */
    private UserPrincipal userResponse;

    /**
     * Access token setter.
     * @param theAccessToken access token to set
     */
    public AuthentificationResponse(final String theAccessToken) {
        this.token = theAccessToken;
    }

    /**
     * JwtReponse overload, set token and userResponse.
     * @param theAccessToken access token to set
     * @param theUserResponse userReposnse to set
     */
    public AuthentificationResponse(final String theAccessToken, final UserPrincipal theUserResponse) {
        this.token = theAccessToken;
        this.setUserResponse(theUserResponse);
    }

    /**
     * @return the token
     */
    public String getAccessToken() {
        return token;
    }

    /**
     * @param theAccessToken the access token to set
     */
    public void setAccessToken(final String theAccessToken) {
        this.token = theAccessToken;
    }

    /**
     * @return the type
     */
    public String getTokenType() {
        return type;
    }

    /**
     * @param theTokenType theTokenType the token type to set
     */
    public void setTokenType(final String theTokenType) {
        this.type = theTokenType;
    }

    /**
     * @return the userResponse
     */
    public UserPrincipal getUserResponse() {
        return userResponse;
    }

    /**
     * @param theUserResponse the userResponse to set
     */
    public void setUserResponse(final UserPrincipal theUserResponse) {
        this.userResponse = theUserResponse;
    }

}
