1.父项目结构
    1.new project -->  选择maven项目
    2.删除冗余src代码
    3.更改pom文件的packing为pom
    4.>git rm -r -f --cache .idea  删除idea文件夹的git缓存，在.ignore中添加idea文件夹
    5.添加readme
    6.提交代码
2.父项目结构提交git
    echo "# review" >> README.md
    git initgit add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin git@github.com:shifeixuangy/review.git
    git push -u origin main
    上述为github实例代码
    1.github默认分支是main，所以更改本地分支名为git branch -m main  
    2.git remote add origin git@github.com:shifeixuangy/review.git
    3.git push -u origin main

3.创建子项目
    1.new modules -->  选择maven项目

4.pom整理
    由于父pom中继承了springboot-parent，所以子项目若是需要使用springboot依赖，直接使用dependencies引入；
    若是引入非springboot代码，可以在父pom中使用<dependencies>标签定义通用依赖，子pom自动继承；
    若是父子想要统一依赖版本号，可以在父pom中使用<dependencyManagement>定义通用依赖，子pom使用<dependencies>并且不引用version，会自  动继承父pom的version；


    