-- alt + x , alt + c
-- 참고 https://blog.sting.pe.kr/104
-- 참고 https://2dubbing.tistory.com/13

-- mysql 권한 설정
CREATE USER smart@'%' IDENTIFIED BY '12345';

DROP USER smart@'%';

GRANT ALL PRIVILEGES ON *.* TO smart@'%' 
WITH GRANT OPTION;

REVOKE ALL PRIVILEGES ON *.* FROM smart@'%';

SHOW GRANTS FOR smart@'%';

flush PRIVILEGES;


