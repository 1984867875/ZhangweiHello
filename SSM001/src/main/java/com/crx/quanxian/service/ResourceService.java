package com.crx.quanxian.service;

import com.crx.quanxian.model.Res;

import java.util.List;

public interface ResourceService {

    List<Res> view ();
    void save(Res res);
}
