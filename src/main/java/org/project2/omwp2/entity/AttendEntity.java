package org.project2.omwp2.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "attend")
public class AttendEntity {

    //근태 아이디
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attend_id")
    private Long attendId;

    // 출근
    @Column(name = "attend_start")
    private LocalDateTime attendStart;

    // 퇴근
    @Column(name = "attend_end")
    private LocalDateTime attendEnd;
    

    // 회원
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "m_id")
    private MemberEntity memberEntity;




}
