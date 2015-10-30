package com.canghai1xin.biz.domain;

@SuppressWarnings("unused")
public class GhHouseDO implements Comparable<GhHouseDO> {

    private String id;
    
    private String owner;
    
    private String ownerMobile;
    
    private String memo;
    
    private String ownerNick;
    
    private boolean isRepresenter;
    
    private boolean isLeakRepresenter;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwnerMobile() {
        return ownerMobile;
    }

    public void setOwnerMobile(String ownerMobile) {
        this.ownerMobile = ownerMobile;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getOwnerNick() {
        return ownerNick;
    }

    public void setOwnerNick(String ownerNick) {
        this.ownerNick = ownerNick;
    }

    public boolean isRepresenter() {
        return isRepresenter;
    }

    public void setIsRepresenter(boolean isRepresenter) {
        this.isRepresenter = isRepresenter;
    }

    public boolean isLeakRepresenter() {
        return isLeakRepresenter;
    }

    public void setIsLeakRepresenter(boolean isLeakRepresenter) {
        this.isLeakRepresenter = isLeakRepresenter;
    }

    @Override
    public int compareTo(GhHouseDO o) {
        if (o == null) {
            return 1;
        }

        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return "GhHouseDO{" +
               "id='" + id + '\'' +
               ", owner='" + owner + '\'' +
               ", ownerMobile='" + ownerMobile + '\'' +
               ", memo='" + memo + '\'' +
               ", ownerNick='" + ownerNick + '\'' +
               ", isRepresenter=" + isRepresenter +
               ", isLeakRepresenter=" + isLeakRepresenter +
               ", representer=" + isRepresenter() +
               ", leakRepresenter=" + isLeakRepresenter() +
               '}';
    }
}
