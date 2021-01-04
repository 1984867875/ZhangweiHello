package com.crx.quanxian.service.serviceImpl;

import com.crx.quanxian.dao.ResMapper;
import com.crx.quanxian.model.Res;
import com.crx.quanxian.model.ResExample;
import com.crx.quanxian.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResMapper mapper;


     @Override
    public List<Res> view(){
    return mapper.selectByExample(new ResExample());
}
    public void save(Res res){
         mapper.insert(res);
    }
}
