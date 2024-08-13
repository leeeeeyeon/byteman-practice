### Byteman Installation (M1 Mac)
```bash
brew install byteman
```
Homebrew로 설치할 경우 byteman.jar의 위치는 `/usr/local/Cellar/byteman/4.0.12/libexec/lib/byteman.jar`

### Byteman으로 프로그램 실행 예시
```bash
java -javaagent:/opt/homebrew/Cellar/byteman/4.0.23/libexec/lib/byteman.jar=script:main.btm com.leeeeeyeon.Main foo bar baz
```

### Reference
- [A Byteman Tutorial](https://developer.jboss.org/docs/DOC-17213)


