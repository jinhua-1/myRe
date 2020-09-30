-- auto create by SMD

set client_encoding = UTF8;
set search_path to LES_PXXT;
commit;

comment on table  T_WZ                                  is '文章表';
comment on column T_WZ.C_BH                             is '主键';
comment on column T_WZ.C_DWBH                             is '单位编号';
comment on column T_WZ.C_BT                             is '标题';
comment on column T_WZ.C_MS                             is '描述';
comment on column T_WZ.LC_NR                             is '内容';
comment on column T_WZ.C_NRCWBJQ                             is '内容纯文本截取';
comment on column T_WZ.C_BTT                             is '标题图';
comment on column T_WZ.DT_FBSJ                             is '发布时间';
comment on column T_WZ.N_ZT                             is '状态';
comment on column T_WZ.C_FBRBH                             is '发布人编号';
comment on column T_WZ.C_FBRXM                             is '发布人姓名';
comment on column T_WZ.N_SFZD                             is '是否置顶';
comment on column T_WZ.N_PX                             is '排序';
comment on column T_WZ.C_ZZ                             is '作者';
comment on column T_WZ.N_LX                             is '类型';
comment on column T_WZ.N_SFZS                             is '是否展示';
comment on column T_WZ.C_SYPWZBH                             is '上一篇文章的编号';
comment on column T_WZ.C_XYPWZBH                             is '下一篇文章的编号';
comment on column T_WZ.C_CJRBH                             is '创建人编号';
comment on column T_WZ.C_CJRXM                             is '创建人姓名';
comment on column T_WZ.C_GXRBH                             is '更新人编号';
comment on column T_WZ.C_GXRXM                             is '更新人姓名';
comment on column T_WZ.DT_CJSJ                             is '创建时间';
comment on column T_WZ.DT_GXSJ                             is '更新时间';

set client_encoding = UTF8;
set search_path to LES_PXXT;
commit;

comment on table  T_KCFL                                  is '课程分类';
comment on column T_KCFL.C_BH                             is '主键';
comment on column T_KCFL.C_MC                             is '名称';
comment on column T_KCFL.N_SFZS                             is '是否展示';
comment on column T_KCFL.C_JJ                             is '简介';
comment on column T_KCFL.C_MS                             is '描述';
comment on column T_KCFL.N_SFTY                             is '是否停用';
comment on column T_KCFL.C_CJRBH                             is '创建人编号';
comment on column T_KCFL.C_GXRBH                             is '更新人编号';
comment on column T_KCFL.DT_CJSJ                             is '创建时间';
comment on column T_KCFL.DT_GXSJ                             is '更新时间';

set client_encoding = UTF8;
set search_path to LES_PXXT;
commit;

comment on table  T_KC                                  is '课程表';
comment on column T_KC.C_BH                             is '主键';
comment on column T_KC.C_KCFLBH                             is '课程分类编号';
comment on column T_KC.C_DWBH                             is '单位编号';
comment on column T_KC.C_MC                             is '名称';
comment on column T_KC.C_LS                             is '老师';
comment on column T_KC.C_MS                             is '描述';
comment on column T_KC.N_SFTY                             is '是否停用';
comment on column T_KC.N_SFZS                             is '是否展示';
comment on column T_KC.C_CJRBH                             is '创建人编号';
comment on column T_KC.C_GXRBH                             is '更新人编号';
comment on column T_KC.DT_CJSJ                             is '创建时间';
comment on column T_KC.DT_GXSJ                             is '更新时间';

set client_encoding = UTF8;
set search_path to LES_PXXT;
commit;

comment on table  T_ZJ                                  is '章节表';
comment on column T_ZJ.C_BH                             is '主键';
comment on column T_ZJ.C_DWBH                             is '单位编号';
comment on column T_ZJ.C_FZJBH                             is '父章节编号';
comment on column T_ZJ.C_MC                             is '名称';
comment on column T_ZJ.C_BTT                             is '标题图';
comment on column T_ZJ.N_SFTY                             is '是否停用';
comment on column T_ZJ.N_SFZS                             is '是否展示';
comment on column T_ZJ.C_KCBHS                             is '课程编号集合';
comment on column T_ZJ.C_KCMCS                             is '课程名称集合';
comment on column T_ZJ.C_CJRBH                             is '创建人编号';
comment on column T_ZJ.C_GXRBH                             is '更新人编号';
comment on column T_ZJ.DT_CJSJ                             is '创建时间';
comment on column T_ZJ.DT_GXSJ                             is '更新时间';

set client_encoding = UTF8;
set search_path to LES_PXXT;
commit;

comment on table  T_KS                                  is '课时表';
comment on column T_KS.C_BH                             is '主键';
comment on column T_KS.C_ZJBH                             is '章节编号';
comment on column T_KS.C_DWBH                             is '单位编号';
comment on column T_KS.C_MC                             is '名称';
comment on column T_KS.C_BTT                             is '标题图';
comment on column T_KS.C_SPLJ                             is '视频链接';
comment on column T_KS.C_SPMC                             is '视频名称';
comment on column T_KS.C_ZYLJ                             is '资源链接';
comment on column T_KS.N_SFBX                             is '是否必修';
comment on column T_KS.N_SFTY                             is '是否停用';
comment on column T_KS.N_SFZS                             is '是否展示';
comment on column T_KS.C_CJRBH                             is '创建人编号';
comment on column T_KS.C_GXRBH                             is '更新人编号';
comment on column T_KS.DT_CJSJ                             is '创建时间';
comment on column T_KS.DT_GXSJ                             is '更新时间';

set client_encoding = UTF8;
set search_path to LES_PXXT;
commit;

comment on table  T_KCJL                                  is '课程记录表';
comment on column T_KCJL.C_BH                             is '主键';
comment on column T_KCJL.C_DWBH                             is '单位编号';
comment on column T_KCJL.C_DWMC                             is '单位名称';
comment on column T_KCJL.C_YHBH                             is '用户编号';
comment on column T_KCJL.C_YHMC                             is '用户名称';
comment on column T_KCJL.C_KCBH                             is '课程编号';
comment on column T_KCJL.C_KCMC                             is '课程名称';
comment on column T_KCJL.N_SFSC                             is '是否收藏';
comment on column T_KCJL.N_XXJD                             is '学习进度';
comment on column T_KCJL.C_CJRBH                             is '创建人编号';
comment on column T_KCJL.C_GXRBH                             is '更新人编号';
comment on column T_KCJL.DT_CJSJ                             is '创建时间';
comment on column T_KCJL.DT_GXSJ                             is '更新时间';

set client_encoding = UTF8;
set search_path to LES_PXXT;
commit;

comment on table  T_ZJJL                                  is '章节记录表';
comment on column T_ZJJL.C_BH                             is '主键';
comment on column T_ZJJL.C_DWBH                             is '单位编号';
comment on column T_ZJJL.C_YHBH                             is '用户编号';
comment on column T_ZJJL.C_YHMC                             is '用户名称';
comment on column T_ZJJL.C_ZJBH                             is '章节编号';
comment on column T_ZJJL.C_ZJMC                             is '章节名称';
comment on column T_ZJJL.N_SFSC                             is '是否收藏';
comment on column T_ZJJL.C_CJRBH                             is '创建人编号';
comment on column T_ZJJL.C_GXRBH                             is '更新人编号';
comment on column T_ZJJL.DT_CJSJ                             is '创建时间';
comment on column T_ZJJL.DT_GXSJ                             is '更新时间';

set client_encoding = UTF8;
set search_path to LES_PXXT;
commit;

comment on table  T_KSJL                                  is '课时记录表';
comment on column T_KSJL.C_BH                             is '主键';
comment on column T_KSJL.C_DWBH                             is '单位编号';
comment on column T_KSJL.C_YHBH                             is '用户编号';
comment on column T_KSJL.C_YHMC                             is '用户名称';
comment on column T_KSJL.C_KSBH                             is '课时编号';
comment on column T_KSJL.C_KSMC                             is '课时名称';
comment on column T_KSJL.C_XXJD                             is '学习进度';
comment on column T_KSJL.N_KSZT                             is '课时状态';
comment on column T_KSJL.C_XXSC                             is '学习时长';
comment on column T_KSJL.DT_KSXXSJ                             is '开始学习时间';
comment on column T_KSJL.DT_XXWBSJ                             is '学习完毕时间';
comment on column T_KSJL.N_SFSC                             is '是否收藏';
comment on column T_KSJL.DT_SCGKSJ                             is '上次观看时间';
comment on column T_KSJL.C_CJRBH                             is '创建人编号';
comment on column T_KSJL.C_GXRBH                             is '更新人编号';
comment on column T_KSJL.DT_CJSJ                             is '创建时间';
comment on column T_KSJL.DT_GXSJ                             is '更新时间';

