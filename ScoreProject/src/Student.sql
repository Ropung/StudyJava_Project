       CREATE TABLE STUDENT (
        stdid          VARCHAR2(20) PRIMARY KEY
        , stdname      VARCHAR2(20) NOT NULL
        , it    NUMBER(6,2) NOT NULL
        , language    NUMBER(6,2) DEFAULT 0 NOT NULL 
        , basic       NUMBER(6,2) DEFAULT 0 NOT NULL
     );
     commit;
        
     CREATE SEQUENCE Student_seq NOCACHE;
         
       insert into STUDENT(stdid, stdname, it, language, basic)
     values (Student_seq.nextval, '노기훈', 50, 50, 50);
       insert into STUDENT(stdid, stdname, it, language, basic)
     values (Student_seq.nextval, '가나다', 40, 40, 40);
       insert into STUDENT(stdid, stdname, it, language, basic)
     values (Student_seq.nextval, '라바사', 30, 30, 30);
     
     SELECT
         *
     FROM STUDENT;
    