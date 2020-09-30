-- auto create by SMD

set client_encoding = UTF8;
set search_path to LES_PXXT;
commit;

-------------------------
-- 文章表
-------------------------

drop table if exists T_WZ;
create table T_WZ
(
    C_BH                  char(32)                             NOT NULL,    -- 主键
    C_DWBH                varchar(300)                         NULL,        -- 单位编号
    C_BT                  varchar(300)                         NULL,        -- 标题
    C_MS                  varchar(300)                         NULL,        -- 描述
    LC_NR                 text                                 NULL,        -- 内容
    C_NRCWBJQ             varchar(300)                         NULL,        -- 内容纯文本截取
    C_BTT                 varchar(300)                         NULL,        -- 标题图
    DT_FBSJ               timestamp(3)                         NULL,        -- 发布时间
    N_ZT                  int                                  NULL,        -- 状态
    C_FBRBH               varchar(300)                         NULL,        -- 发布人编号
    C_FBRXM               varchar(300)                         NULL,        -- 发布人姓名
    N_SFZD                int                                  NULL,        -- 是否置顶
    N_PX                  int                                  NULL,        -- 排序
    C_ZZ                  varchar(300)                         NULL,        -- 作者
    N_LX                  int                                  NULL,        -- 类型
    N_SFZS                int                                  NULL,        -- 是否展示
    C_SYPWZBH             varchar(300)                         NULL,        -- 上一篇文章的编号
    C_XYPWZBH             varchar(300)                         NULL,        -- 下一篇文章的编号
    C_CJRBH               varchar(300)                         NULL,        -- 创建人编号
    C_CJRXM               varchar(300)                         NULL,        -- 创建人姓名
    C_GXRBH               varchar(300)                         NULL,        -- 更新人编号
    C_GXRXM               varchar(300)                         NULL,        -- 更新人姓名
    DT_CJSJ               timestamp(3)                         NULL,        -- 创建时间
    DT_GXSJ               timestamp(3)                         NULL,        -- 更新时间
constraint PK_WZ primary key( C_BH )
);

 commit; 

set client_encoding = UTF8;
set search_path to LES_PXXT;
commit;

-------------------------
-- 课程分类
-------------------------

drop table if exists T_KCFL;
create table T_KCFL
(
    C_BH                  char(32)                             NOT NULL,    -- 主键
    C_MC                  varchar(300)                         NULL,        -- 名称
    N_SFZS                int                                  NULL,        -- 是否展示
    C_JJ                  varchar(300)                         NULL,        -- 简介
    C_MS                  varchar(600)                         NULL,        -- 描述
    N_SFTY                int                                  NULL,        -- 是否停用
    C_CJRBH               varchar(300)                         NULL,        -- 创建人编号
    C_GXRBH               varchar(300)                         NULL,        -- 更新人编号
    DT_CJSJ               timestamp(3)                         NULL,        -- 创建时间
    DT_GXSJ               timestamp(3)                         NULL,        -- 更新时间
constraint PK_KCFL primary key( C_BH )
);

 commit; 

set client_encoding = UTF8;
set search_path to LES_PXXT;
commit;

-------------------------
-- 课程表
-------------------------

drop table if exists T_KC;
create table T_KC
(
    C_BH                  char(32)                             NOT NULL,    -- 主键
    C_KCFLBH              char(32)                             NULL,        -- 课程分类编号
    C_DWBH                varchar(300)                         NULL,        -- 单位编号
    C_MC                  varchar(300)                         NULL,        -- 名称
    C_LS                  varchar(300)                         NULL,        -- 老师
    C_MS                  varchar(300)                         NULL,        -- 描述
    N_SFTY                int                                  NULL,        -- 是否停用
    N_SFZS                int                                  NULL,        -- 是否展示
    C_CJRBH               varchar(300)                         NULL,        -- 创建人编号
    C_GXRBH               varchar(300)                         NULL,        -- 更新人编号
    DT_CJSJ               timestamp(3)                         NULL,        -- 创建时间
    DT_GXSJ               timestamp(3)                         NULL,        -- 更新时间
constraint PK_KC primary key( C_BH )
);

 commit; 

set client_encoding = UTF8;
set search_path to LES_PXXT;
commit;

-------------------------
-- 章节表
-------------------------

drop table if exists T_ZJ;
create table T_ZJ
(
    C_BH                  char(32)                             NOT NULL,    -- 主键
    C_DWBH                varchar(300)                         NULL,        -- 单位编号
    C_FZJBH               varchar(300)                         NULL,        -- 父章节编号
    C_MC                  varchar(300)                         NULL,        -- 名称
    C_BTT                 varchar(300)                         NULL,        -- 标题图
    N_SFTY                int                                  NULL,        -- 是否停用
    N_SFZS                int                                  NULL,        -- 是否展示
    C_KCBHS               text                                 NULL,        -- 课程编号集合
    C_KCMCS               text                                 NULL,        -- 课程名称集合
    C_CJRBH               varchar(300)                         NULL,        -- 创建人编号
    C_GXRBH               varchar(300)                         NULL,        -- 更新人编号
    DT_CJSJ               timestamp(3)                         NULL,        -- 创建时间
    DT_GXSJ               timestamp(3)                         NULL,        -- 更新时间
constraint PK_ZJ primary key( C_BH )
);

 commit; 

set client_encoding = UTF8;
set search_path to LES_PXXT;
commit;

-------------------------
-- 课时表
-------------------------

drop table if exists T_KS;
create table T_KS
(
    C_BH                  char(32)                             NOT NULL,    -- 主键
    C_ZJBH                char(32)                             NULL,        -- 章节编号
    C_DWBH                varchar(300)                         NULL,        -- 单位编号
    C_MC                  varchar(300)                         NULL,        -- 名称
    C_BTT                 varchar(300)                         NULL,        -- 标题图
    C_SPLJ                varchar(300)                         NULL,        -- 视频链接
    C_SPMC                varchar(300)                         NULL,        -- 视频名称
    C_ZYLJ                varchar(900)                         NULL,        -- 资源链接
    N_SFBX                int                                  NULL,        -- 是否必修
    N_SFTY                int                                  NULL,        -- 是否停用
    N_SFZS                int                                  NULL,        -- 是否展示
    C_CJRBH               varchar(300)                         NULL,        -- 创建人编号
    C_GXRBH               varchar(300)                         NULL,        -- 更新人编号
    DT_CJSJ               timestamp(3)                         NULL,        -- 创建时间
    DT_GXSJ               timestamp(3)                         NULL,        -- 更新时间
constraint PK_KS primary key( C_BH )
);

 commit; 

set client_encoding = UTF8;
set search_path to LES_PXXT;
commit;

-------------------------
-- 课程记录表
-------------------------

drop table if exists T_KCJL;
create table T_KCJL
(
    C_BH                  char(32)                             NOT NULL,    -- 主键
    C_DWBH                varchar(300)                         NULL,        -- 单位编号
    C_DWMC                varchar(300)                         NULL,        -- 单位名称
    C_YHBH                varchar(300)                         NULL,        -- 用户编号
    C_YHMC                varchar(300)                         NULL,        -- 用户名称
    C_KCBH                varchar(300)                         NULL,        -- 课程编号
    C_KCMC                varchar(300)                         NULL,        -- 课程名称
    N_SFSC                int                                  NULL,        -- 是否收藏
    N_XXJD                numeric(20, 2)                       NULL,        -- 学习进度
    C_CJRBH               varchar(300)                         NULL,        -- 创建人编号
    C_GXRBH               varchar(300)                         NULL,        -- 更新人编号
    DT_CJSJ               timestamp(3)                         NULL,        -- 创建时间
    DT_GXSJ               timestamp(3)                         NULL,        -- 更新时间
constraint PK_KCJL primary key( C_BH )
);

 commit; 

set client_encoding = UTF8;
set search_path to LES_PXXT;
commit;

-------------------------
-- 章节记录表
-------------------------

drop table if exists T_ZJJL;
create table T_ZJJL
(
    C_BH                  char(32)                             NOT NULL,    -- 主键
    C_DWBH                varchar(300)                         NULL,        -- 单位编号
    C_YHBH                varchar(300)                         NULL,        -- 用户编号
    C_YHMC                varchar(300)                         NULL,        -- 用户名称
    C_ZJBH                varchar(300)                         NULL,        -- 章节编号
    C_ZJMC                varchar(300)                         NULL,        -- 章节名称
    N_SFSC                int                                  NULL,        -- 是否收藏
    C_CJRBH               varchar(300)                         NULL,        -- 创建人编号
    C_GXRBH               varchar(300)                         NULL,        -- 更新人编号
    DT_CJSJ               timestamp(3)                         NULL,        -- 创建时间
    DT_GXSJ               timestamp(3)                         NULL,        -- 更新时间
constraint PK_ZJJL primary key( C_BH )
);

 commit; 

set client_encoding = UTF8;
set search_path to LES_PXXT;
commit;

-------------------------
-- 课时记录表
-------------------------

drop table if exists T_KSJL;
create table T_KSJL
(
    C_BH                  char(32)                             NOT NULL,    -- 主键
    C_DWBH                varchar(300)                         NULL,        -- 单位编号
    C_YHBH                varchar(300)                         NULL,        -- 用户编号
    C_YHMC                varchar(300)                         NULL,        -- 用户名称
    C_KSBH                char(32)                             NULL,        -- 课时编号
    C_KSMC                varchar(300)                         NULL,        -- 课时名称
    C_XXJD                varchar(300)                         NULL,        -- 学习进度
    N_KSZT                int                                  NULL,        -- 课时状态
    C_XXSC                varchar(300)                         NULL,        -- 学习时长
    DT_KSXXSJ             timestamp(3)                         NULL,        -- 开始学习时间
    DT_XXWBSJ             timestamp(3)                         NULL,        -- 学习完毕时间
    N_SFSC                int                                  NULL,        -- 是否收藏
    DT_SCGKSJ             timestamp(3)                         NULL,        -- 上次观看时间
    C_CJRBH               varchar(300)                         NULL,        -- 创建人编号
    C_GXRBH               varchar(300)                         NULL,        -- 更新人编号
    DT_CJSJ               timestamp(3)                         NULL,        -- 创建时间
    DT_GXSJ               timestamp(3)                         NULL,        -- 更新时间
constraint PK_KSJL primary key( C_BH )
);

 commit; 

