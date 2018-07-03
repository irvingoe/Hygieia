package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCollectorItemConfigHistory is a Querydsl query type for CollectorItemConfigHistory
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCollectorItemConfigHistory extends EntityPathBase<CollectorItemConfigHistory> {

    private static final long serialVersionUID = -255320332L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCollectorItemConfigHistory collectorItemConfigHistory = new QCollectorItemConfigHistory("collectorItemConfigHistory");

    public final QBaseModel _super;

    public final MapPath<String, Object, SimplePath<Object>> changeMap = this.<String, Object, SimplePath<Object>>createMap("changeMap", String.class, Object.class, SimplePath.class);

    public final org.bson.types.QObjectId collectorItemId;

    // inherited
    public final org.bson.types.QObjectId id;

    public final EnumPath<ConfigHistOperationType> operation = createEnum("operation", ConfigHistOperationType.class);

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final StringPath userID = createString("userID");

    public final StringPath userName = createString("userName");

    public QCollectorItemConfigHistory(String variable) {
        this(CollectorItemConfigHistory.class, forVariable(variable), INITS);
    }

    public QCollectorItemConfigHistory(Path<? extends CollectorItemConfigHistory> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCollectorItemConfigHistory(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCollectorItemConfigHistory(PathMetadata<?> metadata, PathInits inits) {
        this(CollectorItemConfigHistory.class, metadata, inits);
    }

    public QCollectorItemConfigHistory(Class<? extends CollectorItemConfigHistory> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
    }

}

