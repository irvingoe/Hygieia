package com.capitalone.dashboard.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QRallyFeature is a Querydsl query type for RallyFeature
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QRallyFeature extends EntityPathBase<RallyFeature> {

    private static final long serialVersionUID = -152022514L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRallyFeature rallyFeature = new QRallyFeature("rallyFeature");

    public final QBaseModel _super;

    public final org.bson.types.QObjectId collectorItemId;

    public final SimplePath<Object> endDate = createSimple("endDate", Object.class);

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath instanceUrl = createString("instanceUrl");

    public final StringPath iterationId = createString("iterationId");

    public final StringPath iterationName = createString("iterationName");

    public final StringPath lastExecuted = createString("lastExecuted");

    public final NumberPath<Long> lastUpdated = createNumber("lastUpdated", Long.class);

    public final MapPath<String, Object, SimplePath<Object>> options = this.<String, Object, SimplePath<Object>>createMap("options", String.class, Object.class, SimplePath.class);

    public final StringPath planEstimate = createString("planEstimate");

    public final StringPath plannedVelocity = createString("plannedVelocity");

    public final StringPath projectId = createString("projectId");

    public final StringPath projectName = createString("projectName");

    public final NumberPath<Integer> remainingDays = createNumber("remainingDays", Integer.class);

    public final SimplePath<Object> startDate = createSimple("startDate", Object.class);

    public final StringPath state = createString("state");

    public final SetPath<RallyStoryStages, QRallyStoryStages> storyStages = this.<RallyStoryStages, QRallyStoryStages>createSet("storyStages", RallyStoryStages.class, QRallyStoryStages.class, PathInits.DIRECT2);

    public final StringPath taskActualTotal = createString("taskActualTotal");

    public final StringPath taskEstimateTotal = createString("taskEstimateTotal");

    public final StringPath taskRemainingTotal = createString("taskRemainingTotal");

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final StringPath userListCount = createString("userListCount");

    public QRallyFeature(String variable) {
        this(RallyFeature.class, forVariable(variable), INITS);
    }

    public QRallyFeature(Path<? extends RallyFeature> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QRallyFeature(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QRallyFeature(PathMetadata<?> metadata, PathInits inits) {
        this(RallyFeature.class, metadata, inits);
    }

    public QRallyFeature(Class<? extends RallyFeature> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
    }

}

