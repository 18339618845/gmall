package com.atguigu.gmall.pms.vo;

import com.atguigu.gmall.pms.entity.SpuEntity;
import lombok.Data;

import java.util.List;

@Data
public class SpuVo extends SpuEntity {
    // 描述信息
    private List<String> spuImages;

    // 基本属性值
    private List<SpuAttrValueVo>  baseAttrs;

    // sku相关信息
    private List<SkuVo> skus;
}
