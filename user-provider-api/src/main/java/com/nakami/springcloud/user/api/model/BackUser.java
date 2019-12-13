package com.nakami.springcloud.user.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by wuxiao on 2019/11/30 10:10.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BackUser implements Serializable{
    private String id;
    private String name;
}
