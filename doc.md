redhat RHPAM 
=======================

## 1.  决策表 Hit Policy
###### 1. None
```
This is the normal hit mode. Old decision tables will use this by default, 
but since 7.0 uses PHREAK the row order now matters.
There is no migration tooling needed for the old tables. 
Multiple rows can fire. Verification warns about rows that conflict.
```
###### 2. Resolved Hit
```
Similar to First Hit, but you can for example give row 10 priority over row 5. 
This means you can keep the order of the rows you want for visual readability, 
but specify priority exceptions.
```
###### 3. Unique Hit
```
With unique hit policy each row has to be unique meaning there can be no overlap.
There can never be a situation where two rows can fire, 
if there is the Verification feature warns about this on development time.
```
###### 4. First Hit
```
First hit fires only one row, the one that is satisfied first from top to bottom.
```
###### 5. Rule Order
```
Multiple rows can fire and Verification does not report about conflicts between 
the rows since they are expected to happen.
```
###### 6. 案例
```
NoneHitPolicyGDT
ResolvedHitPolicyGDT
UniqueHitPolicyGDT
FirstHitPolicyGDT
RuleHitPolicyGDT

测试案例正常,但PAM7的new测试模拟器有问题，可以使用Test Scenario (Legacy)
```
## 2.  决策表 Flow
###### 1. 实现方式
```
实现决策表流程有两种方式：
1. 使用business process将各个决策表串联起来
2. 使用决策表调用决策表的方式达到实现流程的效果
```
###### 2. 案例演示
```
演示方式2,查看LoginValidateGDT,可以运行LoginValidateTest(Legacy),查看效果
```