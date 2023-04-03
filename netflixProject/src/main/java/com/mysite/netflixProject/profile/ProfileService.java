package com.mysite.netflixProject.profile;

import java.util.List;

public interface ProfileService {
    public List<ProfileVO> getNicknames(String member_id);
    void insertNickname(String member_id, String nickname);
    int updateNickname(String member_id, int profile_id, String nickname);
    int deleteNickname(String member_id, int profile_id);

}
