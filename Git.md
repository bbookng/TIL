# Git

: 분산형 버전관리 프로그램

#### Repository

- 특정 디렉토리를 버전 관리하는 저장소
- `git init` 명령어로 로컬 저장소를 생성
- `.git` 디렉토리에 버전 관리에 필요한 모든 것이 들어있음



#### Git 기본기

- **커밋(commit)** 은 아래 3가지 영역을 바탕으로 동작

  - Working Directory : `git init` 으로 생성
    - untracked file : 변경 추적 하지 않은 file
  - Staging Area
    - `git add NY_project.txt` : Staging Area 에 Untracked file을 옮기는 명령어
  - Repository (저장소)
    - `git commit` - m " commit을 하는 이유. ": 변경사항을 version 확정을 하는 명령어

  ```python
  git commit -m "1st commit"
  ```

  



- `git config` : git을 사용하는 user set-up

```python
git config --global user.name bbookng
git config --global user.email bbookng@gmail.com

git config --global --list
user.name=bbookng            #출력되는값
user.email=bbookng@gmail.com #출력되는값
```

- `git status` : 현재 git의 상태를 나타내는 명령어

``` python
SSAFY@DESKTOP-KVCQHCD MINGW64 /c/test (master)
#$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        a.txt
        b.txt
        c.txt
        d.txt
        ny_proj.txt

nothing added to commit but untracked files present (use "git add" to track)   
SSAFY@DESKTOP-KVCQHCD MINGW64 /c/test (master)
#$ git add ny_proj.txt

SSAFY@DESKTOP-KVCQHCD MINGW64 /c/test (master)
#$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   ny_proj.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        a.txt
        b.txt
        c.txt
        d.txt

```



- `git rm --cached file` : stage 에 있는 file을 remove (untracted file로 돌아감)

- `git log` : commit 의 내용을 조회하는 명령어

```python
SSAFY@DESKTOP-KVCQHCD MINGW64 /c/test (master)
$ git log
commit 3ad818ca5fb77da50cb997864b7867093e1772e7 (HEAD -> master)
Author: bbookng <bbookng@gmail.com>
Date:   Fri Jul 15 16:07:28 2022 +0900

    2nd commmit

commit b1da16693f73f412f58599b99aecddad0c74edbd
Author: bbookng <bbookng@gmail.com>
Date:   Fri Jul 15 16:00:53 2022 +0900

    1st commit
```

- `git log --oneline` : git log 요약하여 보여주는 명령어

```python

SSAFY@DESKTOP-KVCQHCD MINGW64 /c/test (master)
$ git log --oneline
3ad818c (HEAD -> master) 2nd commmit
b1da166 1st commit

```

# Git hub

#### : Git의 방법을 사용해서 파일을 관리하는 원격 관리 시스템

1. **push** : local > git  (내 PC에서 내보낼 때)

```bash
git remote add origin 'git url` # git과 local 사이에 다리를 놔준다.
git push -u origin master # file 을 보낸다
# origin 은 u의 닉네임 
git remote remove origin
git remote -v # remote 됐는지 확인 
```

2. **pull** : git > local (Github에서 가져올 때)

```bash
git pull origin master
origin <local>
master <branch>
```



2. **clone** : local PC 에 아무것도 없을 때 pull 하는 것. ( Github 에서 처음 가져올 때)

  ```bash
  git clone 주소
  ```

- `git add .` : 현재 디렉토리 파일 다 stage로



# CLI (Command Line Interface)

- vs **GUI (Graphic Users Interface)** : **그래픽**을 통해 컴퓨터와 사용자가 상호작용하는 방식. 

- **CLI** : **명령어**를 통해 컴퓨터와 사용자가 상호작용하는 방식. 

  ![image-20220715144724651](Git.assets/image-20220715144724651.png)

- **~ (틸드)** : 사용자의 홈 디렉토리

- **루트 디렉토리** :  computer machine의 가장 상위 디렉토리 ex) C: (C드라이브)

- **디렉토리**와 **폴더**는 **99% 유사**하다. 

  - 폴더가 디렉토리보다 더 넓은 개념

    

---

#### 절대경로와 상대경로

---



1. **절대경로** : 루트 디렉토리`(C:)`부터 목적 파일`(C:/users/ssafy/a.txt)`까지 모든 경로가 전부 포함
2. **상대경로** : 현재 작업중인 디렉토리를 기준으로 계산한 상대적 위치
   - `'/b.txt'`
   - 나로부터의 거리를 표시하는 기호  : `./`  : 현재폴더 , `../` : 상위폴더(부모폴더)



> C:/users/SSAFY/sky/**a.txt**   > 를 기준으로

> C:/users/SSAFY/sky/b.txt   >> **./b.txt**

> C:/users/SSAFY/c.txt   >>**../c.txt**

> C:/users/SSAFY/KBK/k.txt   >>**../KBK/k.txt**



---

#### Git bash 명령어

---



>- `start, open` : 폴더/파일을 여는 명령어 (Windows : start / Mac : open)
>- `touch` : 파일을 생성하는 명령어, 띄워쓰기로 구분해서 한 번에 생성 가능
>
>- `mkdir` : 새로운 폴더를 만드는 명령어
>- `ls` : 현재 폴더의 리스트를 보여주는 명령어
>- `pwd` : (print working directory) 현재 작업중인 디렉토리
>- `cd` : 현재 작업중인 폴더를 변경하는 명령어
>- `cd x` : x폴더로 이동하는 명령어
>- `ls -a` : 숨겨져있는 파일도 다 보여주는 명령어
>- `ls -l` : 파일 정보를 길게 다 보여주는 명령어
>  - 3-3-3 : owner - guest - admin
>
>- `mv p.txt ../test` : 다른 폴더 간 어떤 파일을 다른 파일로 옮기는 것. 
>  - `mv` : 같은 폴더 내에서 이동하는 명령어.
>
>- `rm` : 파일을 삭제하는 명령어. 복구가 되지 않음

