Repository Init Content
=======================

## 1. redhat RHPAM 决策表 Hit Policy
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

