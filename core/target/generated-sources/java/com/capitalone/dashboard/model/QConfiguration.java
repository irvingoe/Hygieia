package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QConfiguration is a Querydsl query type for Configuration
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QConfiguration extends EntityPathBase<Configuration> {

    private static final long serialVersionUID = 1397617748L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QConfiguration configuration = new QConfiguration("configuration");

    public final QBaseModel _super;

    public final StringPath collectorName = createString("collectorName");

    // inherited
    public final org.bson.types.QObjectId id;

    public final SetPath<java.util.Map<String, String>, SimplePath<java.util.Map<String, String>>> info = this.<java.util.Map<String, String>, SimplePath<java.util.Map<String, String>>>createSet("info", java.util.Map.class, SimplePath.class, PathInits.DIRECT2);

    public QConfiguration(String variable) {
        this(Configuration.class, forVariable(variable), INITS);
    }

    public QConfiguration(Path<? extends Configuration> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QConfiguration(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QConfiguration(PathMetadata<?> metadata, PathInits inits) {
        this(Configuration.class, metadata, inits);
    }

    public QConfiguration(Class<? extends Configuration> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.id = _super.id;
    }

}

