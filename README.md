### Byteman Installation (M1 Mac)
```bash
brew install byteman
```
Homebrew로 설치할 경우 byteman.jar의 위치는 `/usr/local/Cellar/byteman/4.0.12/libexec/lib/byteman.jar`

### Byteman으로 프로그램 실행 예시
Byteman은 javac와 같은 컴파일러로 변환된 바이트 코드(.class)를 사용
```bash
# 바이트 코드 파일 생성
javac com/leeeeeyeon/Main.java 

# Byteman으로 실행
java -javaagent:/opt/homebrew/Cellar/byteman/4.0.23/libexec/lib/byteman.jar=script:main.btm com.leeeeeyeon.Main foo bar baz
```

### Byteman Rule
- 작성 방법은 [Byteman Rule Language](https://github.com/bytemanproject/byteman/blob/main/docs/asciidoc/src/main/asciidoc/chapters/Byteman-Rule-Language.adoc) 참고
- Rule에 에러가 없는지 확인하기 위해 `/opt/homebrew/Cellar/byteman/4.0.23/libexec/bin/bmcheck.sh`를 사용할 수 있음

### TODO
- [ ] Byteman 경로를 환경변수로 등록해서 편하게 쓰기 ...

### Reference
- [A Byteman Tutorial](https://developer.jboss.org/docs/DOC-17213)
- [Byteman Rule Language](https://github.com/bytemanproject/byteman/blob/main/docs/asciidoc/src/main/asciidoc/chapters/Byteman-Rule-Language.adoc)
