package com.busanit501.springboot0226.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Board {

    // 엔티티 클래스는 실제 데이터 베이스의 테이블을 만드는 효과이므로, 반드시 pk 를 생성해야함.
    // 그래서, 필수로 @Id 이용해서, pk 표시를 의무적으로 해야함.
    @Id
    // 마리아 디비에서 사용하는 기본 자동 생성 정책을 이용함.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long bno; // 실제 데이터베이스의 테이블의 컬럼1

    private  String title; // 실제 데이터베이스의 테이블의 컬럼2
    private  String content; // 실제 데이터베이스의 테이블의 컬럼3
    private  String writer; // 실제 데이터베이스의 테이블의 컬럼4
}
