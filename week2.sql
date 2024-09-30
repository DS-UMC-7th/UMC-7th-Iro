#1
#진행 중 / 첫번째 리스트
SELECT m.*
FROM mission AS m OUTER RIGHT JOIN member_mission AS mm ON m.id = mm.mission_id
WHERE mm.status = 'N' AND mm.member_id = :current_member_id:
ORDER BY m.deadline ASC , id ASC
LIMIT 3;

#두번째 이상 #마지막으로 조회한 데이터의 마감일 2024-09-30, id = 3 로 가정
SELECT m.*
FROM mission AS m OUTER RIGHT JOIN member_mission AS mm ON m.id = mm.mission_id
WHERE mm.status = 'N' AND mm.member_id = :current_member_id:
AND (m.deadline > 2024-09-30 OR (m.deadline >= 2024-09-30 AND id != 3 ))
ORDER BY m.deadline ASC , id ASC
LIMIT 3;

#완료 / 첫번째 리스트
SELECT m.*
FROM mission AS m OUTER RIGHT JOIN member_mission AS mm ON m.id = mm.mission_id
WHERE mm.status = 'Y' AND mm.member_id = :current_member_id:
ORDER BY m.deadline ASC , id ASC
LIMIT 3;

#두번째 이상 #마지막으로 조회한 데이터의 마감일 2024-09-30, id = 3 로 가정
SELECT m.*
FROM mission AS m OUTER RIGHT JOIN member_mission AS mm ON m.id = mm.mission_id
WHERE mm.status = 'Y' AND mm.member_id = :current_member_id:
AND (m.deadline > 2024-09-30 OR (m.deadline >= 2024-09-30 AND id != 3 ))
ORDER BY m.deadline ASC , id ASC
LIMIT 3;

#2
INSERT INTO review(member_id,store_id,body,score)
VALUE(:current_member_id:,1,"재방문 의사 있습니다",5.0);

#3
#현재 지역의 id = 1 #첫번째 리스트
SELECT m.*
FROM (SELECT * FROM member_mission WHERE status = 'N' AND member_id = :current_member_id: ) AS mm
LEFT OUTER JOIN (SELECT * FROM mission WHERE store_id = (SELECT id FROM store WHERE region_id = 1)) AS m ON mm.mission_id = m.id
ORDER BY deadline ASC, id ASC
LIMIT 3;

#두번째 이상 리스트 #마지막으로 조회한 데이터의 마감일 2024-09-30, id = 3 로 가정
SELECT m.*
FROM (SELECT * FROM member_mission WHERE status = 'N' AND member_id = :current_member_id: ) AS mm
LEFT OUTER JOIN (SELECT * FROM mission WHERE store_id = (SELECT id FROM store WHERE region_id = 1)) AS m ON mm.mission_id = m.id
WHERE m.deadline < 2024-09-30 OR (m.deadline >= 2024-09-30 AND id != 3 )
ORDER BY deadline ASC, id ASC
LIMIT 3;

#4
SELECT *
FROM member
WHERE id = :current_member_id:;