package com.jasonraymond.awsimageupload.datastore;

import com.jasonraymond.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("dda75cf8-7998-49eb-965b-5ecf1d82cc51"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("73737ae1-9b9e-4fce-a502-8c4bcd036843"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
