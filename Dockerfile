# OpenJDK 17 이미지를 기반으로 함
FROM openjdk:17-alpine

# 작업 디렉토리 설정
WORKDIR /app

# 소스 파일을 컨테이너에 복사
COPY ./src/main/java/com/leeeeeyeon/Hello.java ./src/main/java/com/leeeeeyeon/

# 출력 디렉토리 생성
RUN mkdir -p ./out

# 소스 파일 컴파일
RUN javac -d ./out ./src/main/java/com/leeeeeyeon/Hello.java

# 컴파일된 클래스를 실행
CMD ["java", "-cp", "./out", "com.leeeeeyeon.Hello"]
