package entity;

import java.time.LocalDateTime;

public class User {
    private final String spotifyId;
    private final String displayName;
    private final String accessToken;
    private final String refreshToken;
    private final LocalDateTime tokenExpiry;

    public User(String spotifyId,
                String displayName,
                String accessToken,
                String refreshToken,
                LocalDateTime tokenExpiry) {
        this.spotifyId = spotifyId;
        this.displayName = displayName;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.tokenExpiry = tokenExpiry;
    }

    public String getSpotifyId() {
        return spotifyId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public LocalDateTime getTokenExpiry() {
        return tokenExpiry;
    }

    public boolean isTokenExpired() {
        return tokenExpiry != null && tokenExpiry.isBefore(LocalDateTime.now());
    }
}
