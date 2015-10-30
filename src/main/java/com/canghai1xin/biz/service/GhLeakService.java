package com.canghai1xin.biz.service;

import com.canghai1xin.biz.domain.GhHouseDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@Repository
public class GhLeakService {

    @Autowired
    protected JdbcTemplate jdbcTemplate;
    
    public List<GhHouseDO> listAllGhHouse() {
        String select = "select id, owner, owner_mobile, memo, owner_nick, is_representer, is_leak_representer from gh_house";

        List<GhHouseDO> list = jdbcTemplate.query(select, new RowMapper<GhHouseDO>() {

            @Override
            public GhHouseDO mapRow(ResultSet rs, int rowNum) throws SQLException {
                GhHouseDO _returnDO = new GhHouseDO();

                _returnDO.setId(rs.getString("id"));
                _returnDO.setMemo(rs.getString("memo"));
                _returnDO.setOwner(rs.getString("owner"));
                _returnDO.setOwnerMobile(rs.getString("owner_mobile"));
                _returnDO.setOwnerNick(rs.getString("owner_nick"));
                _returnDO.setIsLeakRepresenter("y".equals(rs.getString("is_leak_representer")));

                return _returnDO;
            }
        });
        Collections.sort(list);
        
        return list;
    }

    public void insert(String id) {
        String insert = "insert into gh_house(id) values ('%s')";
        jdbcTemplate.update(String.format(insert, id));
    }
    
    public void update(String id, String column, String columnVal) {
        String update = "update gh_house set " + column + "='" + columnVal + "' where id='" + id + "'";
        
        jdbcTemplate.update(update);
    }
}
