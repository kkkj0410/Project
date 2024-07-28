package hello.postBoard.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {

    private static Map<Long, Member> members = new HashMap<>();
    private static Long sequence = 0L;

    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance() {
        return instance;
    }

    private MemberRepository() {
    }

    public void saveMember(Member member)
    {
        members.put(sequence++, member);
    }

    public List<Member> findAll(Member member)
    {
        return new ArrayList<>(members.values());
    }

}
